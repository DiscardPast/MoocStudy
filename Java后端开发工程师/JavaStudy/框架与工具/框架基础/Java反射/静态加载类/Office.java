class Office
{
	public static void main(String[] args)
	{
		//new 创建对象 是静态加载类，在编译时刻就要加载所有可能用到的类
		//通过动态加载类可以解决用时在家在相应的类
		if("Word".equals(args[0]))
		{
			Word w = new Word();
			w.start();
		}
		if("Excel".equals(args[0]))
		{
			Excel e = new Excel();
			e.start();
		}
	}
}

