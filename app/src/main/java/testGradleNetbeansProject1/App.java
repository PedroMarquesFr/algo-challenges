/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testGradleNetbeansProject1;

public class App {

    public static void main(String[] args) {
        App instance = new App();
        instance.soma100();
    }

    public static int soma1(int nro, int soma) {
        int s;
        if (nro == 100) {
            s = nro + soma;
        } else {
            s = soma1(nro + 1, nro + soma);
        }
        return s;
    }

    public void soma100() {
        int soma;
        soma = App.soma1(1, 0);
        System.out.println("a soma dos cem primeiros números é " + soma);
    }
}
