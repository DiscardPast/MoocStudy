/**
 * Created by discardpast on 17-8-28.
 */

/*JavaScript-输出内容（document.write）*/
/*document.write() 可用于直接向 HTML 输出流写内容。简单的说就是直接在网页中输出内容。*/
/*第一种:输出内容用""括起，直接输出""号内的内容。*/
document.write("i love javascript");
/*第二种:通过变量，输出内容*/
var mstr = "hello world";
document.write(mstr);
/*第三种:输出多项内容，内容之间用+号连接。*/
var str1 = "hello ";
var str2 = "world!";
document.write(str1+str2+"discardpast!");
/*第四种:输出HTML标签，并起作用，标签使用""括起来。*/
document.write("</br>" + "hello world !!!!!")


/*JavaScript-警告（alert 消息对话框）*/
/*
*
语法:

alert(字符串或变量);
* */
/*
*
注意:

 1. 在点击对话框"确定"按钮前，不能进行任何其它操作。

 2. 消息对话框通常可以用于调试程序。

 3. alert输出内容，可以是字符串或变量，与document.write 相似。
* */
alert("alert测试1");
alert("alert测试2");


/*JavaScript-确认（confirm 消息对话框*/
/*confirm 消息对话框通常用于允许用户做选择的动作，如：“你对吗？”等。弹出对话框(包括一个确定按钮和一个取消按钮)。*/
/*
*语法:

 confirm(str);
* */
/*
*
*   参数说明:

     str：在消息对话框中要显示的文本
     返回值: Boolean值
     参数说明:

     str：在消息对话框中要显示的文本
     返回值: Boolean值

     注: 通过返回值可以判断用户点击了什么按钮

     注: 消息对话框是排它的，即用户在点击对话框按钮前，不能进行任何其它操作。
* */
var sexmessage = confirm("你的性别是?")
if(sexmessage == true)
{
    document.write("你是男士!");
}
else
{
    document.write("你是女士!");
}


/*JavaScript-提问（prompt 消息对话框）*/
/*
*   prompt弹出消息对话框,通常用于询问一些需要与用户交互的信息。弹出消息对话框（包含一个确定按钮、取消按钮与一个文本输入框）。
*   语法:

    prompt(str1, str2);

     参数说明：

     str1: 要显示在消息对话框中的文本，不可修改
     str2：文本框中的内容，可以修改
     返回值:

     1. 点击确定按钮，文本框中的内容将作为函数返回值
     2. 点击取消按钮，将返回null

     注:在用户点击对话框的按钮前，不能进行任何其它操作。
*
*
* */

var name = prompt("请输入你的姓名:");
if(name != null)
{
    alert("你好:"+name);
}
else
{
    alert("你好 my friend!");
}

/*JavaScript-打开新窗口（window.open）*/
/*
* open() 方法可以查找一个已经存在或者新建的浏览器窗口。
*
* 语法：

     window.open([URL], [窗口名称], [参数字符串])
     参数说明:

     URL：可选参数，在窗口中要显示网页的网址或路径。如果省略这个参数，或者它的值是空字符串，那么窗口就不显示任何文档。
     窗口名称：可选参数，被打开窗口的名称。
     1.该名称由字母、数字和下划线字符组成。
     2."_top"、"_blank"、"_self"具有特殊意义的名称。
     _blank：在新窗口显示目标网页
     _self：在当前窗口显示目标网页
     _top：框架网页中在上部窗口中显示目标网页
     3.相同 name 的窗口只能创建一个，要想创建多个窗口则 name 不能相同。
     4.name 不能包含有空格。
     参数字符串：可选参数，设置窗口参数，各参数用逗号隔开。

     参数表详见:images/window.open参数列表

     注意：运行结果考虑浏览器兼容问题
*
* */

/*例如:打开http://www.imooc.com网站，大小为300px * 200px，无菜单，无工具栏，无状态栏，有滚动条窗口：*/
var openWindow = window.open('http://www.baidu.com','_blank','width=300,height=200,menubar=no,toolbar=no, status=no,scrollbars=yes');
/*注意：运行结果考虑浏览器兼容问题。*/


/*JavaScript-关闭窗口（window.close）*/
/*
* close()关闭窗口

     用法：

     window.close();   //关闭本窗口
     或

     <窗口对象>.close();   //关闭指定的窗口

 * */
openWindow.close();

/*编程练习*/
function openW() {
    var con = confirm("是否打开新页面?");
    if(con == true)
    {
        var openwin = window.open('https://www.baidu.com/','_blank','width=400,height=500,menubar=no,toolbar=no, status=no,scrollbars=yes');
    }
}