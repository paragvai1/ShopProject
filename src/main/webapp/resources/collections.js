$(document).ready(function(){
    var collection;
    var catalog;
    var jsonObj;

    $(".catalogs").hide();
    $(".drop-down").mouseenter(function(){
        $(".catalogs").show(500);
    });
    $(".catalogs").mouseleave(function(){
        $(this).hide(500);
    });

    $(".cat").click(function(){
        catalog = $(this).html();
        $(this).parent().parent().find("span").each(function(){
        collection = $(this).html();});
        jsonObj = {collection:collection, name:catalog};
        doAjax();
    });

    function doAjax() {
        $.ajax({
            url: "/products",
            type: "post",
            data:  JSON.stringify(jsonObj),
            dataType: "json",
            success: function (data) {
                alert("SUCCESS");
            },
            error: function (e) {
                alert("ERROR");
            }
        });
    }
});