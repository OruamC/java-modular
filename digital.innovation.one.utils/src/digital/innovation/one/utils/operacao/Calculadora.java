package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.SumHelper;
import digital.innovation.one.utils.operacao.internal.DiviHelper;
import digital.innovation.one.utils.operacao.internal.MultiHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;

public class Calculadora {

    private DiviHelper diviHelper;
    private MultiHelper multiHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora(){
        diviHelper = new DiviHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a, b);
    }

    public int div(int a, int b){
        return diviHelper.execute(a, b);
    }
}
