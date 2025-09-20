import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // ensures 6 digits
    }

    // Method to check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique ✅");
        } else {
            System.out.println("Duplicate OTPs found ❌");
        }
    }
}
