let sn;
document.addEventListener("DOMContentLoaded", () => {
    getData();
});

function getData() {
    let data = {
        sn : sn
    }
    fetch('/get', {
        method: 'POST', // 또는 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then((response) => response.json())
        .then((data) => {
            // document.getElementById("title").innerHTML = data.title;
            // document.getElementById("content").innerHTML = data.content;
            // document.getElementById("dt").innerHTML = data.dt;
            // document.getElementById("tag").innerHTML = data.tag;
            document.getElementById("title").value = data.title;
            document.getElementById("content").value = data.content;
            let tags = data.tag.split('#');


            console.log(data);
        })
        .catch((error) => {
            console.error('실패:', error);
        });
}

function commentFn() {

    let comment = document.getElementById("comment").value
    let data = {
        boardId : sn,
        content : content
    }
    fetch('/commentSave', {
        method: 'POST', // 또는 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then((response) => response.json())
        .then((data) => {
            document.getElementById("content").innerHTML = data.title;
            console.log(data);
        })
        .catch((error) => {
            console.error('실패:', error);
        });
}

