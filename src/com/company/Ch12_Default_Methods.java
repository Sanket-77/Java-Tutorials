package com.company;

interface myCamera{
    void takesnap();
    void recordvideo();
    private void greet(){    // ***** we use this private method in default method *****//
        System.out.println("Good Morning");
    }   //we can not directly call this method because this is private
    default void record4KVideo(){           // ********* default method ****///
        greet();
        System.out.println(" Recording in 4K ");
    }
}

interface myWifi{
    String [] getnetwork();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber( int phoneNumber){
        System.out.println("Calling : "+ phoneNumber);
    }

    void pickCall(){
        System.out.println(" connecting....");
    }
}

class mySmartPhone extends myCellPhone implements myCamera,myWifi{

    @Override
    public void takesnap() {
        System.out.println("Taking snap ");
    }

    @Override
    public void recordvideo() {
        System.out.println("Recording video ");
    }
//    public void record4KVideo(){
//        System.out.println(" Taking snap and Recording in 4K ");
//    }// when we override this method in child class first call this method instead of default method ************

    @Override
    public String[] getnetwork() {
        System.out.println("Getting list of networks");
        String [] networklist = {"sanket", "Prashant", "Shubham"};
        return networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to: " + network);

    }
}

public class Ch12_Default_Methods {
    public static void main(String[] args) {
        mySmartPhone sm = new mySmartPhone();
        String [] ar = sm.getnetwork();
        for(String item: ar){
            System.out.println(item);
        }
        sm.record4KVideo();;
    }
}
