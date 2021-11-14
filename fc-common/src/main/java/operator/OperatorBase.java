package operator;

/**
 * Title: OperatorBase
 * Description:
 * Copyright: 数禾科技 Copyright(c) 2021/11/13
 * Encoding: UNIX UTF-8
 *
 * @author 郑晓刚
 */
public abstract class OperatorBase<T, E> {

    protected E acc;

    public abstract void execute(T t);

    public abstract E getResult();

    public abstract void clear();

}
