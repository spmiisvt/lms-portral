<template>
  <section class="section">
    <div class="row">
      <div class="col-lg-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Генератор текста</h5>

            <!-- Default Tabs -->
            <ul class="nav nav-tabs d-flex" id="myTabjustified" role="tablist">
              <li class="nav-item flex-fill" role="presentation">
                <button class="nav-link w-100 active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home-justified" type="button" role="tab" aria-controls="home" aria-selected="true">Описание</button>
              </li>
              <li class="nav-item flex-fill" role="presentation">
                <button class="nav-link w-100" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile-justified" type="button" role="tab" aria-controls="profile" aria-selected="false">Редактировать</button>
              </li>
            </ul>
            <div class="tab-content pt-2" id="myTabjustifiedContent">
              <div class="tab-pane fade show active" id="home-justified" role="tabpanel" aria-labelledby="home-tab">
                Sunt est soluta temporibus accusantium neque nam maiores cumque temporibus. Tempora libero non est unde veniam est qui dolor. Ut sunt iure rerum quae quisquam autem eveniet perspiciatis odit. Fuga sequi sed ea saepe at unde.
              </div>
              <div class="tab-pane fade" id="profile-justified" role="tabpanel" aria-labelledby="profile-tab">
                <form>
                  <div class="row mb-3">
                    <div class="col-sm-10">
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="projectTitle" placeholder="project">
                        <label for="projectTitle">Название</label>
                      </div>
                      <div class="form-floating mb-3">
                        <textarea class="form-control" placeholder="write something..." id="projectDescription" style="height: 100px;"></textarea>
                        <label for="projectDescription">Описание</label>
                      </div>
                      <div class="row mb-3">
                        <div class="col-sm-10">
                          <button type="submit" class="btn btn-primary">Сохранить</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </form>

              </div>
            </div>

          </div>
        </div>
      </div>
      <div class="col-lg-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Генератор текста</h5>

            <!-- Default Tabs -->
            <ul class="nav nav-tabs d-flex" id="myTabjustified" role="tablist">
              <li class="nav-item flex-fill" role="presentation">
                <button class="nav-link w-100 active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home-justified1" type="button" role="tab" aria-controls="home" aria-selected="true">Описание</button>
              </li>
              <li class="nav-item flex-fill" role="presentation">
                <button class="nav-link w-100" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile-justified1" type="button" role="tab" aria-controls="profile" aria-selected="false">Редактировать</button>
              </li>
            </ul>
            <div class="tab-content pt-2" id="myTabjustifiedContent">
              <div class="tab-pane fade show active" id="home-justified1" role="tabpanel" aria-labelledby="home-tab">
                Sunt est soluta temporibus accusantium neque nam maiores cumque temporibus. Tempora libero non est unde veniam est qui dolor. Ut sunt iure rerum quae quisquam autem eveniet perspiciatis odit. Fuga sequi sed ea saepe at unde.
              </div>
              <div class="tab-pane fade" id="profile-justified1" role="tabpanel" aria-labelledby="profile-tab">
                <form>
                  <div class="row mb-3">
                    <div class="col-sm-10">
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput">Название</label>
                      </div>
                      <div class="form-floating mb-3">
                        <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea" style="height: 100px;"></textarea>
                        <label for="floatingTextarea">Описание</label>
                      </div>
                      <div class="row mb-3">
                        <div class="col-sm-10">
                          <button type="submit" class="btn btn-primary">Сохранить</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </form>

              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
    <div class="container text-center">
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#verticalycentered">
        <i class="bi bi-folder-plus me-1"></i> Добавить проект
      </button>
        <div class="modal fade" id="verticalycentered" tabindex="-1">
          <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title">Создание проекта</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <form>
                  <div class="row mb-3">
                    <div class="col-sm-12">
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput">Название</label>
                      </div>
                      <div class="form-floating mb-3">
                        <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea" style="height: 100px;"></textarea>
                        <label for="floatingTextarea">Описание</label>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                <button type="button" class="btn btn-primary">Сохранить</button>
              </div>
            </div>
          </div>
        </div>
    </div>


  </section>
</template>
