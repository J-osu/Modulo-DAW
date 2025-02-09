class Time {

    constructor (){
        this.time = performance.now();
        this.mDeltaTime = 0;
        this.updateTime();
    }

    updateTime() {
        this.mDeltaTime = (Date.now()-this.time) * 0.001;
        this.time = Date.now();
        requestAnimationFrame(this.updateTime.bind(this));
    }

    mDeltaTime(){
        return this.mDeltaTime;
    }
};

var Timer ={
    now: "",
    day: 0,
    month: 0,
    year: 0,
    hours: 0,
    minutes: 0,
    seconds: 0,
    miliSeconds:0
};

function initTimer(){
    while(true){
        Timer.now = new Date();
        Timer.hours = Timer.now.getHours();
        Timer.minutes = Timer.now.getMinutes();
        Timer.seconds = Timer.now.getSeconds();
        Timer.miliSeconds = Timer.now.getMilliseconds();
        Timer.day = Timer.now.getDate();
        Timer.month = Timer.now.getMonth();
        Timer.year = Timer.now.getFullYear();
    }
};