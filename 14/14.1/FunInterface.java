

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@FunctionalInterface
public interface FunInterface
{
	static void foo()
	{
		System.out.println("foo�෽��");
	}
	default void bar()
	{
		System.out.println("barĬ�Ϸ���");
	}
	void test(); // ֻ����һ�����󷽷�

	void abc();
}
