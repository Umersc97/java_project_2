abstract class Marks {

    double art;
    double science;
    double history;
    abstract void percentage();
}

class studentA extends Marks{
    public studentA(double art, double science, double history){
        this.art = art;
        this.science = science;
        this. history = history;
    }
    @Override
    void percentage() {
        System.out.println("Percentage for Student A is: "+(art+science+history)/3+"%");
    }
}

class studentB extends Marks{
    public studentB(double art, double science, double history){
        this.art = art;
        this.science = science;
        this. history = history;
    }
    @Override
    void percentage() {
        System.out.println("Percentage for Student B is: "+(art+science+history)/3+"%");
    }
}
