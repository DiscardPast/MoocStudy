/**
 * Created by discardpast on 17-8-19.
 */
var dom = document.getElementById('music');
var ctx = dom.getContext('2d');
var width = ctx.canvas.width;
var height = ctx.canvas.height;
var posY = height / 2;

function drawBackground() {
    ctx.save();
    ctx.translate(0, posY);
    ctx.save();
    ctx.beginPath();
    ctx.lineCap = "round";
    ctx.lineWidth = 5;
    ctx.moveTo(10, 0);
    ctx.lineTo(width - 10, 0);
    ctx.fill();
    ctx.stroke();
    ctx.restore();
}
function drawLine_item() {
    ctx.save();
    ctx.save();
    ctx.beginPath();
    ctx.lineCap = "round";
    ctx.strokeStyle = "#fff"
    ctx.lineWidth = 5;

    //纵向两个
    ctx.moveTo(10, -6);
    ctx.lineTo(20, -6);
    ctx.moveTo(10, -12);
    ctx.lineTo(20, -12);
    //横向两个
    ctx.moveTo(30, -6);
    ctx.lineTo(40, -6);
    ctx.moveTo(30, -12);
    ctx.lineTo(40, -12);
    ctx.fill();
    ctx.stroke();
    ctx.restore();
}

drawBackground();
drawLine_item();
