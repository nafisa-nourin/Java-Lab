//03-02-26 Password Validator

class PasswordCheck {
    public static void main(String[] args) {
        String password = "Abc@1234";
        boolean hasUpper = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                }

                if (ch == '@' || ch == '#' || ch == '$') {
                    hasSpecial = true;
                }
            }

            if (hasUpper && hasSpecial) {
                System.out.println("Password is Secure");
                System.out.println(password.replaceAll(".", "*"));
            } else {
                System.out.println("Password is Not Secure");
            }
        } else {
            System.out.println("Password is Not Secure");
        }
    }
}

