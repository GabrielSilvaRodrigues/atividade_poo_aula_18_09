public class App {
    public static void main(String[] args) throws Exception {
        // utilizando_static();
        Veiculo v = new Veiculo();
        v.marca="ford";
        v.modelo="KA";
        Veiculo v1 = new Veiculo();
        v1.marca="fiat";
        v1.modelo="uno";
        final String test_final;
        test_final = "meu primeiro valor";
        test_final = "meu segundo valor";
    }
    public void utilizando_static(){
        Produto.int1=10;
        Produto.int2=10;
    }
    public void conversao(){
        String st1, st2, st3, st4;
        float real1, real2;
        int int1, int2;
        st1="1.2";
        real1 = (float) (new Float(st1).floatValue());
        System.out.println("String para real " + real1 );
        real2=1.3f;
        st2 = new Float(real2).toString();
        System.out.println("Real para String " + st2);
        st3="15";
        int1=Integer.parseInt(st3);
        System.out.println("String para inteiro " + int1);
        int2=25;
        st4=Integer.toString(int2);
        System.out.println("Inteiro para String " + int1);
    }
}
