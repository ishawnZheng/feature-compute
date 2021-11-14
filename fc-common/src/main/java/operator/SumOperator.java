package operator;

/**
 * Title: CountOperator
 * Description:
 * Copyright: 数禾科技 Copyright(c) 2021/11/13
 * Encoding: UNIX UTF-8
 *
 * @author 郑晓刚
 */
public class SumOperator extends OperatorBase<String, Double>{

    protected Double acc;

    @Override
    public void execute(String s) {
        try {
            acc += Double.parseDouble(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Double getResult() {
        return acc;
    }

    @Override
    public void clear() {
        acc = 0.0;
    }
}
