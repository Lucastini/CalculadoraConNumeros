
package negocio;

public class Calculo {
    private float arg1;
    private int operacion;
    
    
    public Calculo(){
        arg1=0f;
        operacion=0;
    }

    public float getArgumento1() {
        return arg1;
    }
    public void setArgumento1(float argumento1) {
        this.arg1 = argumento1;
    }
    public int getOperacion() {
        return operacion;
    }
    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }
    
    public float calculo(float arg2){
        float res;
        switch(operacion){
            case 1:
                res=arg1+arg2;
                break;
            case 2:
                res=arg1-arg2;
            case 3:
                res=arg1*arg2;
            case 4:
                res=arg1/arg2;
            default:
                res=0;
        }
        arg1=0f;
        operacion=0;
        return res;
    }
    
    
    
}
