public class PracticeProblem {

    public static void insertionSort(char[] characters) {
        
        for (int i = 1; i < characters.length; i++) {
            char key = characters[i]; 
            int index = i - 1;

     
            while (index >= 0 && characters[index] > key) {
                characters[index + 1] = characters[index];
                index--;
            }
            characters[index + 1] = key; 
        }

        
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] testArray = {'g', 'e', 'b', 'a', 'd', 'f', 'c'};
        insertionSort(testArray);
    }
}
