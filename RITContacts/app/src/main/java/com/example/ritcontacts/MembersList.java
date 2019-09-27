package com.example.ritcontacts;

public class MembersList {
    private String name;
    private int phone;
    private String description;
    int imgId;

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public static final MembersList[] memberArray = {new MembersList("Dr. B P Vijay Kumar",112233,"Head of the Dept",R.drawable.drbpv),
    new MembersList("Rajaram Gowda",23344,"Associate Professor"),
    new MembersList("Savita K Shetty",334455,"Asst Professor")};

    MembersList(String name,int phone, String description,int imgId){
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.imgId = imgId;
    }

    public String toString(){
        return name;
    }
}
