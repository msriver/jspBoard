function openWindow(num) {
    var url = 'BoardServlet?command=board_check_pass_form&num='+num;
    window.open(url, "수정/삭제", "width=500, height=230, location=no")
}