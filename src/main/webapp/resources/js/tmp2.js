function addTag() {
    let tag = document.getElementById("tag").value;
    if (!tag) {
        alert("태그를 입력해 주세요.")
        return;
    }
    let id = generateRandomString(5);
    let html = `<div id="tag${id}">
                    <a>${tag}</a></br>
                    <input type="hidden" name="tags" value="${tag}">
                    <button onclick="delTag('${id}')">X</button>
                </div>`;
    document.getElementById("tagList").innerHTML += html;
    document.getElementById("tag").value = '';
}

function save() {
    let title = document.getElementById("title").value;
    let content = document.getElementById("content").value;
    let tags = document.getElementsByName("tags")
    let tag = '';
    tags.forEach(e => tag += `#${e.value}`)
    let data = {
        "title": title,
        "content" : content,
        "tag" : tag,
    }
    fetch('/tmpSave', {
        method: 'POST', // 또는 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then((response) => response.json())
        .then((data) => {
            console.log('성공:', data);
        })
        .catch((error) => {
            console.error('실패:', error);
        });
}

function delTag(id) {
    document.getElementById("tag"+id).remove()
}

function generateRandomString(num)  {
    const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';
    let result = '';
    const charactersLength = characters.length;
    for (let i = 0; i < num; i++) {
        result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }

    return result;
}

