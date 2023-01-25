package com.company;

interface myCamera2{
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

interface myWifi2{
    String [] getnetwork();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void callNumber( int phoneNumber){
        System.out.println("Calling : "+ phoneNumber);
    }

    void pickCall(){
        System.out.println(" connecting....");
    }
}

class mySmartPhone2 extends myCellPhone2 implements myCamera2,myWifi2{

    @Override
    public void takesnap() {
        System.out.println("Taking snap ");
    }

    @Override
    public void recordvideo() {
        System.out.println("Recording video ");
    }

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
    public void sampleMeth(){
        System.out.println("sampleMeth");
    }
}

public class Ch14_Polymorphism {
    public static void main(String[] args) {

        // This is example of polymorphism **************
        myCamera2 cam1 = new mySmartPhone2();   // This is smartphone but use it as camera

        cam1.record4KVideo();

        // cam1.getNetwork();  --> not allowed
        //cam1.sampleMeth();  --> Not allowed

    }
}
