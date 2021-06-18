function setIdDelete(id) {
    document.getElementById("deleteList").href="product?action=delete&id="+id;
};
function addProduct(){


}

$(document).ready(function()
{
    // Activate tooltip
    $('[data-toggle="tooltip"]').tooltip();

    // Select/Deselect checkboxes
    let checkbox = $('table tbody input[type="checkbox"]');
    $("#selectAll").click(function()
    {
        if(this.checked){
            checkbox.each(function()
            {
                this.checked = true;
            });
        }
        else
        {
            checkbox.each(function()
            {
                this.checked = false;
            });
        }
    });
    checkbox.click(function()
    {
        if(!this.checked)
        {
            $("#selectAll").prop("checked", false);
        }
    });
});
$(document).ready(function() {
    $('#tableProduct').dataTable( {
        "dom": 'lrtip',
        "lengthChange": false,
        "pageLength": 5
    } );


} );