package operator;

/**
 * Title: CountOperator
 * Description:
 * Copyright: 数禾科技 Copyright(c) 2021/11/13
 * Encoding: UNIX UTF-8
 *
 * @author 郑晓刚
 */
public class CountOperator extends OperatorBase<String, Long>{

    protected Long acc;

    @Override
    public void execute(String s) {
        acc++;
    }

    @Override
    public Long getResult() {
        return acc;
    }

    @Override
    public void clear() {
        acc = 0L;
    }
}
