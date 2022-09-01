package edu.lernia.labb3;
import java.lang.String;

public class Patient {
    boolean isSick;
    String name;
    String symptom;

    String getSickness;


    Patient(String name, String symptom) {
        this.name = name;
        // this.getSickness = getSickness;
        this.symptom = symptom;
        if (symptom != null) {
            setGetSickness();
        }

    }
    public boolean isSick() {
        return isSick;
    }
    private void setGetSickness() {
        this.isSick = true;
    }

    public Patient(String name) {
        this.name = name;
        isSick = false;
    }

    public String getName() {

        return name;
    }

    public String getSickness() {

        return getSickness;
    }

    public void takeMedication (Medicine medicine){
        if(symptom != null && symptom.equalsIgnoreCase(medicine.getTreatmentName())) {
            isSick = false;
            //    symptom = null;
        }
    }
}


