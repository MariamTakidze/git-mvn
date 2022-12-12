package com.solvd.models;

public class DrivingLicenses {
    private int id;

    private String type;

    private String licenseValidation;

    public DrivingLicenses() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicenseValidation() {
        return licenseValidation;
    }

    public void setLicenseValidation(String licenseValidation) {
        this.licenseValidation = licenseValidation;
    }

    @Override
    public String toString() {
        return "DrivingLicenses{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", licenseValidation='" + licenseValidation.toString() + '\'' +
                '}';
    }
}
