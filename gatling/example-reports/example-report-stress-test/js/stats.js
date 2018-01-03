var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "30300",
        "ok": "28393",
        "ko": "1907"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "5937",
        "ok": "5937",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "260",
        "ok": "277",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "525",
        "ok": "538",
        "ko": "0"
    },
    "percentiles1": {
        "total": "4",
        "ok": "5",
        "ko": "0"
    },
    "percentiles2": {
        "total": "379",
        "ok": "415",
        "ko": "0"
    },
    "percentiles3": {
        "total": "1162",
        "ok": "1183",
        "ko": "0"
    },
    "percentiles4": {
        "total": "1744",
        "ok": "1799",
        "ko": "0"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 24534,
        "percentage": 81
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 2513,
        "percentage": 8
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 1346,
        "percentage": 4
    },
    "group4": {
        "name": "failed",
        "count": 1907,
        "percentage": 6
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "459.091",
        "ok": "430.197",
        "ko": "28.894"
    }
},
contents: {
"req_testdata-3a760": {
        type: "REQUEST",
        name: "testData",
path: "testData",
pathFormatted: "req_testdata-3a760",
stats: {
    "name": "testData",
    "numberOfRequests": {
        "total": "30300",
        "ok": "28393",
        "ko": "1907"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "5937",
        "ok": "5937",
        "ko": "0"
    },
    "meanResponseTime": {
        "total": "260",
        "ok": "277",
        "ko": "0"
    },
    "standardDeviation": {
        "total": "525",
        "ok": "538",
        "ko": "0"
    },
    "percentiles1": {
        "total": "4",
        "ok": "5",
        "ko": "0"
    },
    "percentiles2": {
        "total": "379",
        "ok": "415",
        "ko": "0"
    },
    "percentiles3": {
        "total": "1162",
        "ok": "1183",
        "ko": "0"
    },
    "percentiles4": {
        "total": "1744",
        "ok": "1799",
        "ko": "0"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 24534,
        "percentage": 81
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 2513,
        "percentage": 8
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 1346,
        "percentage": 4
    },
    "group4": {
        "name": "failed",
        "count": 1907,
        "percentage": 6
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "459.091",
        "ok": "430.197",
        "ko": "28.894"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
