<script setup>
import { ref, onMounted, onBeforeMount } from 'vue';
import Toolbar from "primevue/toolbar";
import Button from "primevue/button";
import DataTable from "primevue/datatable";
import Column from "primevue/column";

const projects = ref([]);
const selectedProjects = ref(null);
const dt = ref(null);

const openNew = () => {
  console.log("openNew")
}

</script>
<template>
  <div class="grid">
    <div class="col-12">
      <div class="card">
        <Toolbar class="mb-4">
          <template v-slot:end>
            <div class="my-2">
              <Button label="Добавить проект" icon="pi pi-plus" class="p-button-success mr-2" @click="openNew" />
              <Button label="Удалить" icon="pi pi-trash" class="p-button-danger" @click="confirmDeleteSelected" :disabled="!selectedProducts || !selectedProducts.length" />
            </div>
          </template>
        </Toolbar>
        <DataTable
          ref="dt"
          :value="projects"
          v-model:selection="selectedProject"
          dataKey="id"
          :rows="10"
          :paginator="true"
          responsiveLayout="scroll"
        >
          <Column header-style="min-width:10rem">
            <template #body="slotProps">
              <Button icon="pi pi-pencil" class="p-button-rounded p-button-success mr-2" @click="editProduct(slotProps.data)" />
              <Button icon="pi pi-trash" class="p-button-rounded p-button-warning mt-2" @click="confirmDeleteProduct(slotProps.data)" />
            </template>
          </Column>
        </DataTable>
      </div>
    </div>
  </div>
</template>