
package negocio;

public class Calculo {
    private float arg1;
    private char operacion;
    private int contClickBorrar;
    
    
    public Calculo(){
        arg1=0f;
        operacion=0;
    }

    public float getArg1() {
        return arg1;
    }
    public void setArg1(float argumento1) {
        this.arg1 = argumento1;
    }
    public int getOperacion() {
        return operacion;
    }
    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
    public float calculo(float arg2){
        float res=0f;
        switch(operacion){
            case '+':
                res=arg1+arg2;
                break;
            case '-':
                res=arg1-arg2;
                break;
            case '*':
                res=arg1*arg2;
                break;
            case '/':
                res=arg1/arg2;
                break;
            default:
                res=0;
        }
        arg1=0f;
        operacion=0;
        return res;
    }
    
    
    
    
    
}
