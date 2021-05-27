function  gotoDetailPage(eid){
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/Evaluation/getdetail.do?eid="+eid);

}