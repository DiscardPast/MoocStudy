/**
 * Created by discardpast on 17-8-28.
 */

/*认识DOM*/
/*文档对象模型DOM（Document Object Model）定义访问和处理HTML文档的标准方法。DOM 将HTML文档呈现为带有元素、属性和文本的树结构（节点树）。*/

/*通过ID获取元素*/
/*
*
 学过HTML/CSS样式，都知道，网页由标签将信息组织起来，而标签的id属性值是唯一的，就像是每人有一个身份证号一样，只要通过身份证号就可以找到相对应的人。那么在网页中，我们通过id先找到标签，然后进行操作。

 语法:

 document.getElementById(“id”)
 注:获取的元素是一个对象，如想对元素进行操作，我们要通过它的属性或方法。
* */
var mytitle = document.getElementById("mytitle");
document.write(mytitle);

/*innerHTML 属性*/
/*innerHTML 属性用于获取或替换 HTML 元素的内容。*/
/*
*
* 语法:

     Object.innerHTML
     注意:

     1.Object是获取的元素对象，如通过document.getElementById("ID")获取的元素。

     2.注意书写，innerHTML区分大小写。
* */
/*
* 例子:
*    <script type="text/javascript">
     var testChange = document.getElementById("testChange");
     document.write("p标签原始内容:" + testChange.innerText + "</br>");
     testChange.innerText = "test change after!";
     document.write("p标签修改后的内容:" + testChange.innerText + "</br>");
     </script>
*
* */

/*改变 HTML 样式*/
/*
* 语法:

     Object.style.property=new style;

     注意:Object是获取的元素对象，如通过document.getElementById("id")获取的元素。

     详见基本属性表.

     注意:该表只是一小部分CSS样式属性，其它样式也可以通过该方法设置和修改。
* */

/*显示和隐藏（display属性）*/
/*网页中经常会看到显示和隐藏的效果，可通过display属性来设置。*/
/*
* 语法：

     Object.style.display = value
     注意:Object是获取的元素对象，如通过document.getElementById("id")获取的元素。

     value取值:
     none 此元素不会被显示(即隐藏)
     block 此元素将显示为块级元素(即显示)
* */

/*控制类名（className 属性）*/
/*className 属性设置或返回元素的class 属性。*/
/*
* 语法：

     object.className = classname
     作用:

     1.获取元素的class 属性

     2. 为网页内的某个元素指定一个css样式来更改该元素的外观
* */