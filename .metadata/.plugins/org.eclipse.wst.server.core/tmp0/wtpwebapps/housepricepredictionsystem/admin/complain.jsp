<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no" name="viewport">
  <title>House Mart</title>
  <!-- General CSS Files -->
  <link rel="stylesheet" href="adminResources/css/app.min.css">
  <link rel="stylesheet" href="adminResources/css/selectric.css">
  <!-- Template CSS -->
  <link rel="stylesheet" href="adminResources/css/style.css">
  <link rel="stylesheet" href="adminResources/css/components.css">
  <!-- Custom style CSS -->
  <link rel="stylesheet" href="adminResources/css/custom.css">
  <link rel='shortcut icon' type='image/x-icon' href='adminResources/image/favicon.ico' />
  <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="./adminResources/css/register.css">
</head>

<body>
  <div class="loader"></div>
  <jsp:include page="header.jsp"></jsp:include>
  <jsp:include page="menu.jsp"></jsp:include>
  
  <div class="main-content" style="min-height: 562px;">
        <section class="section">
          <div class="section-body">
            <div class="row">
              <div class="col-12">
                <div class="card">
                  <div class="card-header">
                    <h4>Write Your Post</h4>
                  </div>
                  <div class="card-body">
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Title</label>
                      <div class="col-sm-12 col-md-7">
                        <input type="text" class="form-control">
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Category</label>
                      <div class="col-sm-12 col-md-7">
                        <div class="selectric-wrapper selectric-form-control selectric-selectric selectric-above"><div class="selectric-hide-select"><select class="form-control selectric" tabindex="-1">
                          <option>Tech</option>
                          <option>News</option>
                          <option>Political</option>
                        </select></div><div class="selectric"><span class="label">Tech</span><b class="button">▾</b></div><div class="selectric-items" tabindex="-1" style="width: 564.406px;"><div class="selectric-scroll"><ul><li data-index="0" class="selected highlighted">Tech</li><li data-index="1" class="">News</li><li data-index="2" class="last">Political</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Content</label>
                      <div class="col-sm-12 col-md-7">
                        <textarea class="summernote-simple" style="display: none;"></textarea><div class="note-editor note-frame card"><div class="note-dropzone">  <div class="note-dropzone-message"></div></div><div class="note-toolbar-wrapper" style="height: 36px;"><div class="note-toolbar card-header" style="position: relative; top: 0px; width: 100%;"><div class="note-btn-group btn-group note-style"><button type="button" class="note-btn btn btn-light btn-sm note-btn-bold" tabindex="-1" title="" data-original-title="Bold (CTRL+B)"><i class="note-icon-bold"></i></button><button type="button" class="note-btn btn btn-light btn-sm note-btn-italic" tabindex="-1" title="" data-original-title="Italic (CTRL+I)"><i class="note-icon-italic"></i></button><button type="button" class="note-btn btn btn-light btn-sm note-btn-underline" tabindex="-1" title="" data-original-title="Underline (CTRL+U)"><i class="note-icon-underline"></i></button><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Remove Font Style (CTRL+\)"><i class="note-icon-eraser"></i></button></div><div class="note-btn-group btn-group note-font"><button type="button" class="note-btn btn btn-light btn-sm note-btn-strikethrough" tabindex="-1" title="" data-original-title="Strikethrough (CTRL+SHIFT+S)"><i class="note-icon-strikethrough"></i></button></div><div class="note-btn-group btn-group note-para"><div class="note-btn-group btn-group"><button type="button" class="note-btn btn btn-light btn-sm dropdown-toggle" tabindex="-1" data-toggle="dropdown" title="" data-original-title="Paragraph"><i class="note-icon-align-left"></i></button><div class="dropdown-menu"><div class="note-btn-group btn-group note-align"><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Align left (CTRL+SHIFT+L)"><i class="note-icon-align-left"></i></button><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Align center (CTRL+SHIFT+E)"><i class="note-icon-align-center"></i></button><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Align right (CTRL+SHIFT+R)"><i class="note-icon-align-right"></i></button><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Justify full (CTRL+SHIFT+J)"><i class="note-icon-align-justify"></i></button></div><div class="note-btn-group btn-group note-list"><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Outdent (CTRL+[)"><i class="note-icon-align-outdent"></i></button><button type="button" class="note-btn btn btn-light btn-sm" tabindex="-1" title="" data-original-title="Indent (CTRL+])"><i class="note-icon-align-indent"></i></button></div></div></div></div></div></div><div class="note-editing-area"><div class="note-handle"><div class="note-control-selection" style="display: none;"><div class="note-control-selection-bg"></div><div class="note-control-holder note-control-nw"></div><div class="note-control-holder note-control-ne"></div><div class="note-control-holder note-control-sw"></div><div class="note-control-sizing note-control-se"></div><div class="note-control-selection-info"></div></div></div><textarea class="note-codable"></textarea><div class="note-editable card-block" contenteditable="true" style="min-height: 150px;"><p><br></p></div></div><div class="note-statusbar">  <div class="note-resizebar">    <div class="note-icon-bar"></div>    <div class="note-icon-bar"></div>    <div class="note-icon-bar"></div>  </div></div></div>
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Thumbnail</label>
                      <div class="col-sm-12 col-md-7">
                        <div id="image-preview" class="image-preview">
                          <label for="image-upload" id="image-label">Choose File</label>
                          <input type="file" name="image" id="image-upload">
                        </div>
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Tags</label>
                      <div class="col-sm-12 col-md-7">
                        <div class="bootstrap-tagsinput"><input type="text" placeholder=""></div><input type="text" class="form-control inputtags" style="display: none;">
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Status</label>
                      <div class="col-sm-12 col-md-7">
                        <div class="selectric-wrapper selectric-form-control selectric-selectric selectric-above"><div class="selectric-hide-select"><select class="form-control selectric" tabindex="-1">
                          <option>Publish</option>
                          <option>Draft</option>
                          <option>Pending</option>
                        </select></div><div class="selectric"><span class="label">Publish</span><b class="button">▾</b></div><div class="selectric-items" tabindex="-1" style="width: 564.406px;"><div class="selectric-scroll"><ul><li data-index="0" class="selected highlighted">Publish</li><li data-index="1" class="">Draft</li><li data-index="2" class="last">Pending</li></ul></div></div><input class="selectric-input" tabindex="0"></div>
                      </div>
                    </div>
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3"></label>
                      <div class="col-sm-12 col-md-7">
                        <button class="btn btn-primary">Create Post</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        
  
  <script type="text/javascript">
  const check = function() {
	  document.getElementById("submit-btn").addEventListener("click", function(event){
		  event.preventDefault()
		});
	  console.log(document.getElementById('password').value);
	  console.log(document.getElementById('password2').value);
	  if (document.getElementById('password').value ==
	    document.getElementById('password2').value) {
	    $(this).trigger(e.type);
	  } else {
	   alert("Password is not matching");
	  }
	}
  </script>
  <!-- General JS Scripts -->
  <script src="adminResources/js/app.min.js"></script>
  <!-- JS Libraies -->
  <script src="adminResources/js/jquery.pwstrength.min.js"></script>
  <script src="adminResources/js/jquery.selectric.min.js"></script>
  <!-- Page Specific JS File -->
  <script src="adminResources/js/auth-register.js"></script>
  <!-- Template JS File -->
  <script src="adminResources/js/scripts.js"></script>
  <!-- Custom JS File -->
  <script src="adminResources/js/custom.js"></script>
</body>

</html>