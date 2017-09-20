# BootStrap快速入门

* Bootstrap全局样式的特点
	1. 代码整洁
	2. 风格统一
	3. 美观易用

* Bootstrap中的排版
	1. 标题
		- h1:36px
		- h2:30px
		- h3:24px
		- h4:18px
		- h5:14px
		- h6:12px
	2. 副标题
		- small标签
	3. 文本
		- 段落
			- p标签
				- 默认字体大小:14px
				- 行高：20px
				- 底部外边距：10px
		- 对齐方式
			- 左对齐:.text-left
			- 居中对齐:.text-center
			- 右对齐:.text-right
		- 大小写
			- 全部小写:.text-lowercase
			- 全部大写：.text-uppercase.
			- 首字母大写:.text-capitalize
		- 标签
			- 标记标签:mark
			- 删除文本标签:del
			- 插入文本标签:ins
			- 下划线文本标签:u
			- 着重语气标签:strong
	4. 表格
		- 表格风格
            - 带边框表格:.table-bordered
            - 条纹状表格:.table-striped
            - 悬停变色:.table-hover
            - 紧凑风格:.table-condensed
		- 表格状态位
			- danger
			- success
			- waring
			- info
			- primary
	5. 表单
		- html5中，输入框提示信息:placeholder属性
		- 样式
			- 圆角响应变色:form-control
			- form组件:form-group
			- form中所有的元素水平排列:form-inline
			- 分组状态
				- 输入框大小
					- 更大:input-lg
					- 更小:input-sm
				- lable
					- 隐藏:sr-only
					- 可控制:contral-lable
				- 状态
					- 绿色:has-success
					- 黄色:has-waring
					- 红色:has-error
	6. 按钮
		- 使用bootstrape按钮样式:btn
		- 颜色改变
			- 默认灰色:btn-default
			- 绿色:btn-success
			- 深蓝色:btn-primary
			- 蓝色:btn-info
			- 橘黄色:btn-warning
			- 红色:btn-danger
		- 大小改变
			- 更大:btn-lg
            - 更小:btn-sm
        - 状态
        	- 点击状态:active
        	- 全局铺满:btn-block
        	- 禁止点击：disabled="disabled"
		- 变为标签:btn-link
		- 使用a制作button:class="btn btn-danger"
	7. 图片
		- 圆角:.img-rounded
		- 圆形:.img-circle
		- 带有边框的圆角图形:.img-thumbnail
	8. 辅助类
		- 文本颜色
		- 背景颜色
		- 状态设置
		- 三角符号
* 响应式前端开发
	1. viewport
		- pc终端像素为我们设计的页面上显示的大小
			- 手持设备没有进行缩放的时候，1pc终端像素=1手机端物理单位
			- 当页面方法的时候，1pc终端像素会覆盖好几个手机端物理单位
			- 当页面缩小的时候，1手机端物理单位又会覆盖好几个pc终端像素

```
示例代码:
<meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1,minimum-scale=1,user-scalable=no">
参数详解:
	- width:窗口初始化宽度
	- heigth:窗口初始化高度
	- user-scalable:是否允许用户放大缩小
	- initial-scale:初始的缩放比例
	- maximum-scale：最大的缩放比例
	- minimum-scale：最小的缩放比例
```

	2. 栅格化布局

```
示例代码:
<style>
        .test
        {
            width:300px;
            height: 200px;
            background-color: #1b6d85;
        }
        @media screen and (max-width: 900px) and (min-width: 500px){
            .test
            {
                width: 100%;
                height: 100px;
                background-color: #5cb85c;
            }
        }
</style>
```

		- 参数详解
			- max-width:当前屏幕最大多少时使用下面样式
			- min-width：当前屏幕最小多少时使用下面样式
			- bootstrap中的栅格布局
			- 会将屏幕纵向分为12份
			- 代码

```
.bootstrap-test
        {
            height: 200px;
            background-color: #985f0d;
        }
        <div class="bootstrap-test col-lg-3 col-md-4 col-sm-6 col-xs-12 col-lg-offset-3 col-md-offset-4"></div>
```

            - 参数详解
            	- bootstrap-test:原有样式
            	- col-lg-3:超大屏时占3/12份
            	- col-md-4:中屏时占4/12份
            	- col-sm-6:小屏时占6/12份
            	- col-xs-12:占整个屏幕
            	- col-lg-offset-3:大屏时向左偏移3/12份
            	- col-md-offset-4：中屏时向左偏移4/12份
	3. 单位
		- px
			- px是相对于屏幕分辨率的长度单位
			- px的大小无法更随屏幕放大缩小
			- 所有浏览器都支持px单位
		- em
			- em是相对与当前文本内的字体尺寸
			- 1em=16px（各浏览器不相同）
			- em会继承父级元素的字体大小
			- IE的部分浏览器不支持em
		- rem
        	- rem与em类似，相对于HTML根节点的字体单位
        	- html{font-size:62.5%;}(10px)
	4. 图标
		- 字体图标
			- 特点
				- 体积小便于加载
				- 无需重复设计
				- 方便引用

* Bootstrap组件
	1. 特殊属性
		- role:HTML5的标签属性,用于标识普通标签使之语义化,方便浏览器对其具体的功能进行识别，给忙问浏览器工具进行识别
		- aria-label:用于输入框,当焦点落于输入框时,阅读软件就会读出输入框的内容
		- tablndex:设置键盘中的tab在控件中的移动顺序，方便有障碍人士上网浏览网页
		- data-:HTML5中新增的自定义data属性，可在其后添加自定义内容，在页面上不显示，不会影响到页面的正常显示，可以通过自定义的属性实现，一些数据传递，数据交互的效果等
	2. 字体图标
		- 带有字体图标的按钮代码

```
<button class="btn btn-danger">
<span class="glyphicon glyphicon-star"></span>
    这是一个带有star的按钮
</button>
```

	3. 下拉菜单
		- .dropdown控制组件为下拉
		- .dropdown-menu-right代替.pull-rirht右对齐
		- divider分割线
		- 代码

```
<div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
        这是按钮
        <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
    </ul>
</div>
```

	4. 控件组
		- .input-group表示控件组
		- .input-group-addon可放置额外的内容及图标
		- 代码

```
<div class="input-group">
    <span class="input-group-addon">
        账户
    </span>
    <input type="text" class="form-control">
</div>
```

	5. 导航
		- 以一个带有class.nav的无序列表开始
		- .nav-tabs代表可切换的导航
		- .nav-pills代表胶囊导航
		- .nav-tabs-justified使导航垂直

```
示例代码:
<div>
    <ul class="nav nav-tabs">
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
    </ul>
</div>
<div>
    <ul class="nav nav-pills">
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
    </ul>
</div>
<div>
    <ul class="nav nav-tabs-justified">
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
    </ul>
</div>
```

	6. 分页
		- .pagination在父元素中添加表示分页
		- .pager放置在翻页区域
		- .previous把链接向左对齐,。next把链接向右对齐。
		- 代码

```
<div>
<ul class="pagination ">
    <li><a href="#">Prev</a></li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li><a href="#">Next</a></li>
</ul>
</div>`
``

	7. 进度条
		- .progress表示进度条
		- 通过状态类改变进度条的颜色
		- .progress-bar-striped使得进度条颜色渐变、
		- 代码

```
<div class="progress">
    <div class="progress-bar progress-bar-success progress-bar-striped" style="width:60%">
        60%
    </div>
</div>
```

	8. 列表
		- .list-group代表列表组
		- .badge代表状态数
		- .active代表选中状态
		- 代码

```
<div>
    <ul class="list-group">
        <li class="list-group-item active">
            这是一个列表
            <span class="badge">14</span>
        </li>
        <li class="list-group-item disabled">
            这是一个列表
            <span class="badge">14</span>
        </li>
        <li class="list-group-item list-group-item-warning">
            这是一个列表
            <span class="badge">14</span>
        </li>
    </ul>
</div>
```

	9. 面板
		- .panel代表面板
		- .panel-body代表面板内容
		- .panel-footer代表面板的注脚
		- 代码

```
<div class="panel panel-primary">
    <div class="panel-heading">
        弹出层
    </div>
    <div class="panel-body">
        面板的具体内容
    </div>
    <div class="panel-footer">
        面板的脚注
    </div>
</div>
```

* Boorstrap中的插件
	1. Bootstrap插件依赖Bootstrap.js
	2. Bootstrap.js基于JQuery
	3. 通过data属性控制页面交互
	4. $(document).off('.data-api')解除属性绑定
	5. 代码

```
<div class="panel panel-primary">
    <div class="panel-heading">
        弹出层
    </div>
    <div class="panel-body">
        面板的具体内容
    </div>
    <div class="panel-footer">
        面板的脚注
    </div>
</div>

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
    弹窗
</button>
<button class="btn btn-primary" data-toggle="modal" data-target="#modaltest">
    测试
</button>

<div id="modaltest">
    测试
</div>

<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span>&times;</span><span class="sr-only">关闭弹窗</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">标题</h4>
            </div>
            <div class="modal-body">
                慕课网
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>```

