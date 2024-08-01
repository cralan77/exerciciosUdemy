package entities;

public class Student {

    private String name;
    private double noteOne;
    private double noteTwo;
    private double noteTree;

    public void calc(){
        double resultado;
        resultado=(getNoteOne()+getNoteTwo()+getNoteTree());
        System.out.printf("FINAL GRADE: %.2f \n", resultado);
        if(resultado>=60){
            System.out.print("PASS");

        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60-resultado);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNoteOne() {
        return noteOne;
    }

    public void setNoteOne(double noteOne) {
        this.noteOne = noteOne*30;
    }

    public double getNoteTwo() {
        return noteTwo;
    }

    public void setNoteTwo(double noteTwo) {
        this.noteTwo = noteTwo*35;
    }

    public double getNoteTree() {
        return noteTree;
    }

    public void setNoteTree(double noteTree) {
        this.noteTree = noteTree*35;
    }
}
