<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src='js/jquery.min.js'></script>
</head>
<body>
<form>
输入要查询的电话号码<input id='number' type="text" >
<br>
<input type="button" value="提交" onclick="sub()">
</form>
<script type="text/javascript">
function sub(){
	$.ajax({
		type:'GET',
		url:'getMess.do',
		data:{"number":$("#number").val()},
		dataType:'json',
		success:function(returndata){
			console.info(returndata);
			alert("地区："+returndata.area+"\n类型:"+returndata.type+"\n区号："+returndata.areacode);
		}
	});
}
</script>
</body>
</html>