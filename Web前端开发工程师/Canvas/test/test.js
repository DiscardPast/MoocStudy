
/**
 * Created by discardpast on 17-8-19.
 */
window.onload = function() {
    var ctx = new AudioContext();
    var audio = document.getElementById('myAudio');
    var audioSrc = ctx.createMediaElementSource(audio);
    var analyser = ctx.createAnalyser();
    // we have to connect the MediaElementSource with the analyser
    audioSrc.connect(analyser);
    // we could configure the analyser: e.g. analyser.fftSize (for further infos read the spec)

    // frequencyBinCount tells you how many values you'll receive from the analyser
    var frequencyData = new Uint8Array(analyser.frequencyBinCount);

    // we're ready to receive some data!
    // loop
    function renderFrame() {
        requestAnimationFrame(renderFrame);
        // update data in frequencyData
        analyser.getByteFrequencyData(frequencyData);
        // render frame based on values in frequencyData
        // console.log(frequencyData)
    }
    audio.start();
    renderFrame();
};

// a full circle
var twoPi = 2*Math.PI;
var objectsCount = 12;
var radius = 100

// you want to align objectsCount objects on the circular path
// with constant distance between neighbors
var change = twoPi/objectsCount;
for (var i=0; i < twoPi; i+=change) {
    var x = radius*cos(i);
    var y = radius*sin(i);
    // rotation of object in radians
    var rotation = i;
    // set the CSS properties to calculated values
}