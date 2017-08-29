/**
 * Created by discardpast on 17-8-19.
 */


/*
*
*
*为什么JavaScript非常值得我们学习吗？

 1. 所有主流浏览器都支持JavaScript。

 2. 目前，全世界大部分网页都使用JavaScript。

 3. 它可以让网页呈现各种动态效果。

 4. 做为一个Web开发师，如果你想提供漂亮的网页、令用户满意的上网体验，JavaScript是必不可少的工具。

 二、易学性

 1.学习环境无外不在，只要有文本编辑器，就能编写JavaScript程序。

 2.我们可以用简单命令，完成一些基本操作。

 三、从哪开始学习呢？

 学习JavaScript的起点就是处理网页，所以我们先学习基础语法和如何使用DOM进行简单操作。
*
* */


/*JavaScript-判断语句（if...else）*/
/*if...else语句是在指定的条件成立时执行代码，在条件不成立时执行else后的代码。*/
/*
*
*
语法:

 if(条件)
 { 条件成立时执行的代码 }
 else
 { 条件不成立时执行的代码 }

*
* */
function age(age) {
    if(age >18)
        document.write("成年人");
    else
        document.write("未成年人");
}

age(10);