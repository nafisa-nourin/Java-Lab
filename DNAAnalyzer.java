//03-02-26 DNA Analyzer

class DNAAnalyzer {
    public static void main(String[] args) {
        String dna = "ATGCCT";

        int A = 0, T = 0, G = 0, C = 0;

        for (int i = 0; i < dna.length(); i++) {
            char ch = dna.charAt(i);
            if (ch == 'A') A++;
            if (ch == 'T') T++;
            if (ch == 'G') G++;
            if (ch == 'C') C++;
        }

        System.out.println("A: " + A);
        System.out.println("T: " + T);
        System.out.println("G: " + G);
        System.out.println("C: " + C);

        StringBuilder sb = new StringBuilder(dna);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'A') sb.setCharAt(i, 'T');
            else if (ch == 'T') sb.setCharAt(i, 'A');
            else if (ch == 'G') sb.setCharAt(i, 'C');
            else if (ch == 'C') sb.setCharAt(i, 'G');
        }

        System.out.println("Reverse Complement: " + sb);
    }
}

