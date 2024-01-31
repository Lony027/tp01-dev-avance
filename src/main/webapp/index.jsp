<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <title>Formulaire Bootstrap</title>
</head>
<body>

<div class="container mt-5">
    <form>
        <div class="mb-3">
            <label for="InputTitle" class="form-label">Title</label>
            <input class="form-control" id="InputTitleID" aria-describedby="emailHelp">
          </div>
        <div class="mb-3">
          <label for="InputDescription" class="form-label">Description</label>
          <input class="form-control" id="InputDescriptionID" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
          <label for="InputAddress" class="form-label">Address</label>
          <input class="form-control" id="InputAddressID">
        </div>
        <div class="mb-3">
            <label for="InputMail" class="form-label">Mail</label>
            <input class="form-control" id="InputMailID">
          </div>

        <button type="submit" class="btn btn-primary">Save</button>
      </form>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>