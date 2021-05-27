$(document).ready(function() {


});
function check(form) {
    var subjectName=$('#subjectName').val();
    var description=$('#description').val();
    if(subjectName==''||description==''){
        alert('Remplissez toutes les informations');
        return;
    }
    var minimum=$('#minimum').val();
    var maximum=$('#maximum').val();

    if(minimum>maximum){
        alert('Le nombre minimum de personnes doit être supérieur au maximum');
        return;
    }
    var gnl=confirm("Sure to submit?");
    if (gnl==true){
        $('#form').submit();
    }else{
        return false;
    }

}