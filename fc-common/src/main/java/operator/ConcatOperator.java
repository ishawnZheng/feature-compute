package operator;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Title: CountOperator
 * Description:
 * Copyright: 数禾科技 Copyright(c) 2021/11/13
 * Encoding: UNIX UTF-8
 *
 * @author 郑晓刚
 */
public class ConcatOperator extends OperatorBase<String, String>{

    protected LinkedList<String> acc;
    final int maxSize = 100;

    public ConcatOperator() {
        acc = new LinkedList<>();
    }
    @Override
    public void execute(String s) {
        if (acc.size() > maxSize) {
            acc.remove();
        }
        acc.add(s);
    }

    @Override
    public String getResult() {
        return acc.toString();
    }

    @Override
    public void clear() {
        acc.clear();
    }
}
