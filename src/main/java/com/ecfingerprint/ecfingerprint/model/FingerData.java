package com.ecfingerprint.ecfingerprint.model;

import java.util.List;

public class FingerData {

    private String dateOfBirth;
    private String nid10Digit;
    private String nid17Digit;
    private String rightThumb;
    private String rightIndex;
    private String leftThumb;
    private String leftIndex;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNid10Digit() {
        return nid10Digit;
    }

    public void setNid10Digit(String nid10Digit) {
        this.nid10Digit = nid10Digit;
    }

    public String getNid17Digit() {
        return nid17Digit;
    }

    public void setNid17Digit(String nid17Digit) {
        this.nid17Digit = nid17Digit;
    }

    public FingerData(String rightThumb, String rightIndex, String leftThumb, String leftIndex) {

        this.rightThumb = rightThumb;
        this.rightIndex = rightIndex;
        this.leftThumb = leftThumb;
        this.leftIndex = leftIndex;
    }

    public String getRightThumb() {
        return rightThumb;
    }

    public void setRightThumb(String rightThumb) {
        this.rightThumb = rightThumb;
    }

    public String getRightIndex() {
        return rightIndex;
    }

    public void setRightIndex(String rightIndex) {
        this.rightIndex = rightIndex;
    }

    public String getLeftThumb() {
        return leftThumb;
    }

    public void setLeftThumb(String leftThumb) {
        this.leftThumb = leftThumb;
    }

    public String getLeftIndex() {
        return leftIndex;
    }

    public void setLeftIndex(String leftIndex) {
        this.leftIndex = leftIndex;
    }
}
