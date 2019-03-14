$(document).ready(function () {
    console.log("not there...");
    $("#numbers-form").submit(function (event) {
        console.log("im here");
        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var numbersHolder = {}
    numbersHolder["numbers"] = $("#numbers").val().split(" ");
    numbersHolder["order"] = $('#order input:radio:checked').val();

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/numbers/sort-command",
        data: JSON.stringify(numbersHolder),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Sorted list</h4><pre>" + JSON.stringify(data) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);

        },
        error: function (e) {
            var json = "<h4>Error</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
        }
    });

}