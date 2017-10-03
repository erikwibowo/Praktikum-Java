public class ExBreakUnlabel {
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
            "Nico", "Yza", "Gem", "Ethan"};
        String searchName = "Yza";
        boolean foundname = false;
        for (int i=0; 1<names.length; i++){
            if (names[i].equals(searchName)){
                foundname = true;
                break;
            }
        }

        if (foundname){
            System.out.println(searchName+" found!");
        }else{
            System.out.println(searchName+" not found!");
        }
    }
}