fetch('/tmpList', {
    method: 'POST', // 또는 'PUT'
    headers: {
        'Content-Type': 'application/json',
    },
})
    .then((response) => response.json())
    .then((data) => {
        data.forEach(function (e) {
            document.getElementById("content").innerHTML += `<tr><td><a href="/tmpDetail?sn=${e.sn}">${e.title}</a></td></tr>`;
        })
    })
    .catch((error) => {
        console.error('실패:', error);
    });