/**
 * Created by discardpast on 17-8-18.
 */
function draw() {
    var AudioContext = AudioContext || webkitAudioContext;
    var context = new AudioContext;
//加载媒体
    var audio = new Audio(url);
//创建节点
    var source = context.createMediaElementSource(audio);
    var analyser = context.createAnalyser();
//连接：source → analyser → destination
    source.connect(analyser);
    analyser.connect(context.destination);

    analyser.fftSize = 4096;
    var length = analyser.fftSize;
//创建数据
    var dataArray = new Uint8Array(length);

    var audioCtx = new (window.AudioContext || window.webkitAudioContext)();
    var analyser = audioCtx.createAnalyser();

    analyser.fftSize = 256;
    var bufferLength = analyser.frequencyBinCount;
    console.log(bufferLength);
    var dataArray = new Uint8Array(bufferLength);

    canvasCtx.clearRect(0, 0, WIDTH, HEIGHT);

    function draw() {
        drawVisual = requestAnimationFrame(draw);

        analyser.getByteFrequencyData(dataArray);

        canvasCtx.fillStyle = 'rgb(0, 0, 0)';
        canvasCtx.fillRect(0, 0, WIDTH, HEIGHT);

        var barWidth = (WIDTH / bufferLength) * 2.5;
        var barHeight;
        var x = 0;

        for (var i = 0; i < bufferLength; i++) {
            barHeight = dataArray[i];

            canvasCtx.fillStyle = 'rgb(' + (barHeight + 100) + ',50,50)';
            canvasCtx.fillRect(x, HEIGHT - barHeight / 2, barWidth, barHeight / 2);

            x += barWidth + 1;
        }
    };
}


draw();