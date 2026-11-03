import java.util.ArrayList;
import java.util.HashSet;

class Q12 {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<String>();
        HashSet<String> patientIds = new HashSet<String>();

        patients.add("Aman");
        patientIds.add("P101");

        patients.add("Riya");
        patientIds.add("P102");

        patients.add("Rahul");
        patientIds.add("P103");

        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + patientIds);

        // Search patient
        if (patientIds.contains("P102")) {
            System.out.println("Patient ID P102 Found");
        } else {
            System.out.println("Patient Not Found");
        }

        // Remove patient
        patients.remove("Riya");
        patientIds.remove("P102");

        System.out.println("After Removal:");
        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + patientIds);
    }
}