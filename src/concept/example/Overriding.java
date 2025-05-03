package concept.example;

class Overriding extends OverridingImpl {

    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        overriding.callOverriding();
    }
//    @Override
//    void callOverriding() {
//        System.out.println("Message is overriden now");
//    }
//    abstract void callOverriding();
}
