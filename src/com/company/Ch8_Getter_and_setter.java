package com.company;

class Employee{
    private int id;
    private String name;

    // setter & getter =>  getter and setter method give you centralized control how a certain field is initialized
    // and provided to client
    // Getter Method return its value and setter Method set or update its value

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id = id;
    }
}

public class Ch8_Getter_and_setter {

    public static void main(String[] args) {

        Employee  st = new Employee();

        st.setName("prashant");
        System.out.println(st.getName());
        st.setId(47);
        System.out.println(st.getId());

    }

}
