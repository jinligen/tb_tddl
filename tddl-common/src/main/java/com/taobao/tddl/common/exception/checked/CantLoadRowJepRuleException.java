/*(C) 2007-2012 Alibaba Group Holding Limited.	

public class CantLoadRowJepRuleException extends TDLCheckedExcption{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1765363763147779906L;
	public CantLoadRowJepRuleException(String expression,String vtable,String parameter) {
		super("�޷�ͨ��param:"+parameter+"|virtualTableName:"+vtable+"|expression:"+expression+"�ҵ�ָ���Ĺ����ж�����");
	}

}