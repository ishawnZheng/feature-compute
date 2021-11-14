package operator;

/**
 * Title: CountOperator
 * Description:
 * Copyright: 数禾科技 Copyright(c) 2021/11/13
 * Encoding: UNIX UTF-8
 *
 * @author 郑晓刚
 */
public class AvgOperator extends OperatorBase<String, Double>{

    protected Double acc;
    protected long cnt;

    @Override
    public void execute(String s) {
        try {
            acc += Double.parseDouble(s);
            cnt++;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Double getResult() {
        return acc / cnt;
    }

    @Override
    public void clear() {
        acc = 0.0;
        cnt = 0;
    }
}
