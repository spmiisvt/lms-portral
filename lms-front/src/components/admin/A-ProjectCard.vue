<script setup>
const props = defineProps({
  id: {
    type: Number,
    required: true
  },
  title: {
    type: String,
    required: true
  },
  description: {
    type: String,
    required: true
  }
})
</script>

<template>
  <div class="col-lg-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">{{title}}</h5>

        <!-- Default Tabs -->
        <ul class="nav nav-tabs d-flex" id="myTabjustified" role="tablist">
          <li class="nav-item flex-fill" role="presentation">
            <button class="nav-link w-100 active" id="home-tab" data-bs-toggle="tab" :data-bs-target="'#home-justified' + id" type="button" role="tab" aria-controls="home" aria-selected="true">Описание</button>
          </li>
          <li class="nav-item flex-fill" role="presentation">
            <button class="nav-link w-100" id="profile-tab" data-bs-toggle="tab" :data-bs-target="'#edit-justified' + id" type="button" role="tab" aria-controls="profile" aria-selected="false">Редактировать</button>
          </li>
        </ul>

        <div class="tab-content pt-2" id="myTabjustifiedContent">
          <div class="tab-pane fade show active" :id="'home-justified' + id" role="tabpanel" aria-labelledby="home-tab">
            {{description}}
          </div>
          <div class="tab-pane fade" :id="'edit-justified' + id" role="tabpanel" aria-labelledby="profile-tab">
            <form>
              <div class="row mb-3">
                <div class="col-sm-12">
                  <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="projectTitle" placeholder="project" :value="title">
                    <label for="projectTitle">Название</label>
                  </div>
                  <div class="form-floating mb-3">
                    <textarea class="form-control" id="projectDescription" style="height: 150px;">{{description}}
                    </textarea>
                    <label for="projectDescription">Описание</label>
                  </div>
                  <div class="row mb-3">
                    <div class="col-sm-12">
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
</template>
