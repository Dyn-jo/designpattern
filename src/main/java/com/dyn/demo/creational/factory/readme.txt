日志记录器的设计

该记录器可以通过多种途径保存系统的运行日志，如通过文件记录或数据库记录，用户可以通过修改配置文件灵活地更换日志记录方式。
在设计各类日志记录器时，Sunny公司的开发人员发现需要对日志记录器进行一些初始化工作，
初始化参数的设置过程较为复杂，而且某些参数的设置有严格的先后次序，否则可能会发生记录失败。
如何封装记录器的初始化过程并保证多种记录器切换的灵活性是Sunny公司开发人员面临的一个难题。


工厂方法模式(Factory Method Pattern)：定义一个用于创建对象的接口，让子类决定将哪一个类实例化。
工厂方法模式是一种类创建型模式。

 缺点：使用简单工厂模式势必会增加系统中类的个数，扩展方法时改动大