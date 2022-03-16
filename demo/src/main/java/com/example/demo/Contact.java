package com.example.demo;

public class Contact {
    private String name; 
    private String surname;
    private String age; 
    private String email;

    public Contact(String name, String surname, String age, String email){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setEmail(email);
    }

    public String getName(){
        return name; 
    }
    public String getSurname(){
        return surname; 
    }
    public String getAge(){
        return age; 
    }

    public String getEmail(){
        return email; 
    }

    public void setSurname(String surname){
        this.surname= surname;
    }
    public void setName(String name){
        this.name= name; 
    }
    public void setAge(String age){
        this.age= age; 
    }

    public void setEmail(String email){
        this.email = email; 
    }




    
}
