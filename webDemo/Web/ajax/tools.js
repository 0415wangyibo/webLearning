//自定义请求
var xmlhttp;
function getUrlMathod(url,cfunc)
{
    if (window.XMLHttpRequest)
    {// IE7+, Firefox, Chrome, Opera, Safari 代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {// IE6, IE5 代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=cfunc;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();
}
function postUrlMathod(url,body,cfunc)
{
    if (window.XMLHttpRequest)
    {// IE7+, Firefox, Chrome, Opera, Safari 代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {// IE6, IE5 代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=cfunc;
    xmlhttp.open("POST",url,true);
    xmlhttp.send(body);
}